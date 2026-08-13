.class final Lj$/time/chrono/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/time/temporal/r;
.implements Ljava/io/Serializable;


# static fields
.field public static final synthetic e:I = 0x0

.field private static final serialVersionUID:J = 0xd5c8c11b1L


# instance fields
.field private final a:Lj$/time/chrono/Chronology;

.field final b:I

.field final c:I

.field final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    sget-object v1, Lj$/time/temporal/b;->YEARS:Lj$/time/temporal/b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lj$/time/temporal/b;->MONTHS:Lj$/time/temporal/b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lj$/time/temporal/b;->DAYS:Lj$/time/temporal/b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Lj$/com/android/tools/r8/a;->i([Ljava/lang/Object;)Ljava/util/List;

    return-void
.end method

.method constructor <init>(Lj$/time/chrono/Chronology;III)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "chrono"

    invoke-static {p1, v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lj$/time/chrono/f;->a:Lj$/time/chrono/Chronology;

    iput p2, p0, Lj$/time/chrono/f;->b:I

    iput p3, p0, Lj$/time/chrono/f;->c:I

    iput p4, p0, Lj$/time/chrono/f;->d:I

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Deserialization via serialization delegate"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method final a(Ljava/io/DataOutput;)V
    .locals 1

    iget-object v0, p0, Lj$/time/chrono/f;->a:Lj$/time/chrono/Chronology;

    invoke-interface {v0}, Lj$/time/chrono/Chronology;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeUTF(Ljava/lang/String;)V

    iget v0, p0, Lj$/time/chrono/f;->b:I

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeInt(I)V

    iget v0, p0, Lj$/time/chrono/f;->c:I

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeInt(I)V

    iget v0, p0, Lj$/time/chrono/f;->d:I

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeInt(I)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lj$/time/chrono/f;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lj$/time/chrono/f;

    iget v1, p1, Lj$/time/chrono/f;->b:I

    iget v3, p0, Lj$/time/chrono/f;->b:I

    if-ne v3, v1, :cond_1

    iget v1, p0, Lj$/time/chrono/f;->c:I

    iget v3, p1, Lj$/time/chrono/f;->c:I

    if-ne v1, v3, :cond_1

    iget v1, p0, Lj$/time/chrono/f;->d:I

    iget v3, p1, Lj$/time/chrono/f;->d:I

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Lj$/time/chrono/f;->a:Lj$/time/chrono/Chronology;

    iget-object p1, p1, Lj$/time/chrono/f;->a:Lj$/time/chrono/Chronology;

    invoke-interface {v1, p1}, Lj$/time/chrono/Chronology;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Lj$/time/chrono/f;->c:I

    const/16 v1, 0x8

    invoke-static {v0, v1}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v0

    iget v1, p0, Lj$/time/chrono/f;->b:I

    add-int/2addr v0, v1

    iget v1, p0, Lj$/time/chrono/f;->d:I

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v1

    add-int/2addr v1, v0

    iget-object v0, p0, Lj$/time/chrono/f;->a:Lj$/time/chrono/Chronology;

    invoke-interface {v0}, Lj$/time/chrono/Chronology;->hashCode()I

    move-result v0

    xor-int/2addr v0, v1

    return v0
.end method

.method public final n(Lj$/time/chrono/ChronoLocalDate;)Lj$/time/temporal/m;
    .locals 7

    .prologue
    const-string v0, "temporal"

    invoke-static {p1, v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {}, Lj$/time/temporal/n;->e()Lj$/time/temporal/TemporalQuery;

    move-result-object v0

    invoke-interface {p1, v0}, Lj$/time/temporal/TemporalAccessor;->x(Lj$/time/temporal/TemporalQuery;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj$/time/chrono/Chronology;

    iget-object v1, p0, Lj$/time/chrono/f;->a:Lj$/time/chrono/Chronology;

    if-eqz v0, :cond_1

    invoke-interface {v1, v0}, Lj$/time/chrono/Chronology;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lj$/time/DateTimeException;

    invoke-interface {v1}, Lj$/time/chrono/Chronology;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0}, Lj$/time/chrono/Chronology;->getId()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Chronology mismatch, expected: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", actual: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget v0, p0, Lj$/time/chrono/f;->b:I

    iget v2, p0, Lj$/time/chrono/f;->c:I

    if-nez v2, :cond_2

    if-eqz v0, :cond_6

    int-to-long v0, v0

    sget-object v2, Lj$/time/temporal/b;->YEARS:Lj$/time/temporal/b;

    :goto_1
    invoke-interface {p1, v0, v1, v2}, Lj$/time/temporal/m;->d(JLj$/time/temporal/t;)Lj$/time/temporal/m;

    move-result-object p1

    goto :goto_4

    :cond_2
    sget-object v3, Lj$/time/temporal/a;->MONTH_OF_YEAR:Lj$/time/temporal/a;

    invoke-interface {v1, v3}, Lj$/time/chrono/Chronology;->F(Lj$/time/temporal/a;)Lj$/time/temporal/v;

    move-result-object v1

    invoke-virtual {v1}, Lj$/time/temporal/v;->g()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v1}, Lj$/time/temporal/v;->h()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v1}, Lj$/time/temporal/v;->d()J

    move-result-wide v3

    invoke-virtual {v1}, Lj$/time/temporal/v;->e()J

    move-result-wide v5

    sub-long/2addr v3, v5

    const-wide/16 v5, 0x1

    add-long/2addr v3, v5

    goto :goto_2

    :cond_3
    const-wide/16 v3, -0x1

    :goto_2
    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    if-lez v1, :cond_4

    int-to-long v0, v0

    mul-long/2addr v0, v3

    int-to-long v2, v2

    add-long/2addr v0, v2

    :goto_3
    sget-object v2, Lj$/time/temporal/b;->MONTHS:Lj$/time/temporal/b;

    goto :goto_1

    :cond_4
    if-eqz v0, :cond_5

    int-to-long v0, v0

    sget-object v3, Lj$/time/temporal/b;->YEARS:Lj$/time/temporal/b;

    invoke-interface {p1, v0, v1, v3}, Lj$/time/temporal/m;->d(JLj$/time/temporal/t;)Lj$/time/temporal/m;

    move-result-object p1

    :cond_5
    int-to-long v0, v2

    goto :goto_3

    :cond_6
    :goto_4
    iget v0, p0, Lj$/time/chrono/f;->d:I

    if-eqz v0, :cond_7

    int-to-long v0, v0

    sget-object v2, Lj$/time/temporal/b;->DAYS:Lj$/time/temporal/b;

    invoke-interface {p1, v0, v1, v2}, Lj$/time/temporal/m;->d(JLj$/time/temporal/t;)Lj$/time/temporal/m;

    move-result-object p1

    :cond_7
    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .prologue
    iget-object v0, p0, Lj$/time/chrono/f;->a:Lj$/time/chrono/Chronology;

    iget v1, p0, Lj$/time/chrono/f;->d:I

    iget v2, p0, Lj$/time/chrono/f;->c:I

    iget v3, p0, Lj$/time/chrono/f;->b:I

    if-nez v3, :cond_0

    if-nez v2, :cond_0

    if-nez v1, :cond_0

    invoke-interface {v0}, Lj$/time/chrono/Chronology;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " P0D"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v0}, Lj$/time/chrono/Chronology;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " P"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v3, :cond_1

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v0, 0x59

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    if-eqz v2, :cond_2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v0, 0x4d

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v0, 0x44

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_3
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected writeReplace()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lj$/time/chrono/C;

    const/16 v1, 0x9

    invoke-direct {v0, v1, p0}, Lj$/time/chrono/C;-><init>(BLjava/lang/Object;)V

    return-object v0
.end method
