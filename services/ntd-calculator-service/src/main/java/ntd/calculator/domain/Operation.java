package ntd.calculator.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "operations")
public class Operation extends BaseEntity {

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private OperationType operationType;

    private BigDecimal cost;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Operation operation = (Operation) o;
        return operationType == operation.operationType && Objects.equals(cost, operation.cost);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(operationType);
        result = 31 * result + Objects.hashCode(cost);
        return result;
    }

}
