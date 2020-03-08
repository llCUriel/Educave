package classDAO;

import classVO.UsuarioVO;
import java.util.ArrayList;

public interface IUsuarioDAO {

    public String registrarUsuario(UsuarioVO user);

    public String actualizarUsuario(UsuarioVO user);

    public UsuarioVO buscarUsuarioPorNick(String clave);

    public String eliminarUsuario(String clave);

    public ArrayList<UsuarioVO> getListUsuario();

    public UsuarioVO buscarUsuarioPorCorreo(String clave);
}
