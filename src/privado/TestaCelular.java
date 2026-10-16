package privado;

public class TestaCelular {
    public static void main (String[] args)
    {
        Celular meucelular = new Celular("Iphone", "14 promax", 2022);

        /* meucelular.setMArca ("iphone");
      meucelular.setModelo ("14 promax");
        meucelular.setAno (2022);*/

        System.out.println("Marca: " +meucelular.getMarca());
        System.out.println("Modelo: " +meucelular.getmodelo());
        System.out.println("Ano: " +meucelular.getAno());

    }
}
