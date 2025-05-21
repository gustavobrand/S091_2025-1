package aula12.DecoratorEncriptacao;

public abstract class DataSourceDecorator implements DataSource {
    private DataSource objetoEncapsulado;

    DataSourceDecorator(DataSource source) {
        this.objetoEncapsulado = source;
    }

    @Override
    public void EscreverDados(String data) {
    	objetoEncapsulado.EscreverDados(data);
    }

    @Override
    public String LerDados() {
        return objetoEncapsulado.LerDados();
    }
}