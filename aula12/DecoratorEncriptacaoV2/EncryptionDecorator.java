package aula12.DecoratorEncriptacaoV2;

import java.util.Base64;

public class EncryptionDecorator implements DataSource {
	private DataSource objetoEncapsulado;

    public EncryptionDecorator(DataSource objetoEncapsulado) {
		this.objetoEncapsulado = objetoEncapsulado;
	}

	@Override
    public void EscreverDados(String data) {
        objetoEncapsulado.EscreverDados(encode(data));
    }

    @Override
    public String LerDados() {
        return decode(objetoEncapsulado.LerDados());
    }

    private String encode(String data) {
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    private String decode(String data) {
        byte[] result = Base64.getDecoder().decode(data);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }
        return new String(result);
    }
}
