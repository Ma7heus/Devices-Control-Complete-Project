package br.com.common.resources;

import javax.annotation.security.PermitAll;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.common.DTO.SmartphoneDTO;

@Path("smartphone")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface SmartphoneResource {

	@GET
	@Path("find")
	public Response findAll();

	@GET
	@Path("find/{idEntidade}")
	public Response findById(@PathParam("idEntidade") Long idEntidade);

	@POST
	@PermitAll
	public Response cadastrar(SmartphoneDTO entidadeDTO);

	@PUT
	@Path("{idEntidade}")
	public Response atualiza(@PathParam("idEntidade") Long idEntidade, SmartphoneDTO entidadeDTO);

	@DELETE
	@Path("{idEntidade}")
	public Response deleta(@PathParam("idEntidade") Long idEntidade);

}
