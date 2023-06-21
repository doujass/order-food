package br.com.orderfood.pagamentos.repository;

import br.com.orderfood.pagamentos.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {


}
