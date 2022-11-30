
import java.io.*; //utilizada para recuperar informações sobre os arquivos (metadados) {path, tamanho, quando criado/modificado}. Ela não lê e nem escreve.

public class teste1{
    public static void main (String[] args) {
    }
        public static String testando() throws IOException {
            String path = "C:/Users/PUC Minas/Desktop/Projetos PUC/Java/Arquivos/teste1.txt";

            FileReader test = new FileReader(path);
    
    
            char[] buffer = new char [10];
    
            test.read(buffer);
    
            String text = new String(buffer);
    
            System.out.println("Arquivo lido");
            test.close();
    
            return text;
        }
 
        public static void escrevendo() throws IOException {
            String path = "C:/Users/PUC Minas/Desktop/Projetos PUC/Java/Arquivos/teste1.txt";

            FileWriter excressão = new FileWriter(path);
    
            FileWriter file_writer = new FileWriter(path);

            String mg = "ASA";
            file_writer.write(mg);

            file_writer.close();
            excressão.close();
            System.out.println("Arquivo escrito");
    
        }
 
        
        
        
        
        
        
        
        
        
        //if(arq.canWrite()) se é possivel escrever no arquivo

        //arq.delete apaga o arquivo ou diretorio

        //arq.length descobrindo o tamanho do arquivo em bytes = 0 se for diretorio

        //arq.mkdir cria uma pasta

        //if(arq.canRead()) se é possivel ler o arquivo
        
        /*if(arq.isFile()){ //verifica se o arquivo é um arquivo -> Retorna boolean
            System.out.print("Hello my friend, this is my... = "+ " "+arq.exists()); //retorna que é, pois estou apontando pra um arq
        } else {
            arq.createNewFile(); //caso contrario, cria um arquivo
        }*/
        
        /*if(arq.isDirectory()){ //verifica se o arquivo é um diretorio/pasta -> Retorna boolean
            System.out.print("Hello my friend, this is my... = "+ " "+arq.exists());
        } else {
            System.out.print("O arquivo/pasta nao existe = "+ " "+arq.exists()); //vai retornar aqui pq estou apontando pra um arq
        }*/
        
        /*if(arq.exists()){ //verifica se o arquivo existe -> Retorna boolean
            System.out.print("Hello my friend, this is my... = "+ " "+arq.exists());
        } else {
            System.out.print("O arquivo/pasta não existe = "+ " "+arq.exists());
        }*/



    
}
