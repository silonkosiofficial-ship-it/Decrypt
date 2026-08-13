.class public final LS0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:LS0/V;

.field private b:LS0/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v6, LS0/V;

    invoke-static {}, LM0/e;->g()LM0/d;

    move-result-object v1

    sget-object v0, LM0/N;->b:LM0/N$a;

    invoke-virtual {v0}, LM0/N$a;->a()J

    move-result-wide v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LS0/V;-><init>(LM0/d;JLM0/N;Ly7/k;)V

    iput-object v6, p0, LS0/k;->a:LS0/V;

    new-instance v0, LS0/l;

    iget-object v1, p0, LS0/k;->a:LS0/V;

    invoke-virtual {v1}, LS0/V;->f()LM0/d;

    move-result-object v1

    iget-object v2, p0, LS0/k;->a:LS0/V;

    invoke-virtual {v2}, LS0/V;->h()J

    move-result-wide v2

    invoke-direct {v0, v1, v2, v3, v4}, LS0/l;-><init>(LM0/d;JLy7/k;)V

    iput-object v0, p0, LS0/k;->b:LS0/l;

    return-void
.end method

.method public static final synthetic a(LS0/k;LS0/i;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, LS0/k;->e(LS0/i;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final c(Ljava/util/List;LS0/i;)Ljava/lang/String;
    .locals 11

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error while applying EditCommand batch to buffer (length="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LS0/k;->b:LS0/l;

    invoke-virtual {v1}, LS0/l;->h()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", composition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LS0/k;->b:LS0/l;

    invoke-virtual {v1}, LS0/l;->d()LM0/N;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", selection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LS0/k;->b:LS0/l;

    invoke-virtual {v1}, LS0/l;->i()J

    move-result-wide v1

    invoke-static {v1, v2}, LM0/N;->q(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "):"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "append(value)"

    invoke-static {v10, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xa

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, "append(\'\\n\')"

    invoke-static {v10, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v7, LS0/k$a;

    invoke-direct {v7, p2, p0}, LS0/k$a;-><init>(LS0/i;LS0/k;)V

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const-string v2, "\n"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v10

    invoke-static/range {v0 .. v9}, Lj7/v;->p0(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lx7/l;ILjava/lang/Object;)Ljava/lang/Appendable;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final e(LS0/i;)Ljava/lang/String;
    .locals 4

    .prologue
    instance-of v0, p1, LS0/a;

    const/16 v1, 0x29

    const-string v2, ", newCursorPosition="

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CommitTextCommand(text.length="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast p1, LS0/a;

    invoke-virtual {p1}, LS0/a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LS0/a;->b()I

    move-result p1

    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :cond_0
    instance-of v0, p1, LS0/T;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SetComposingTextCommand(text.length="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast p1, LS0/T;

    invoke-virtual {p1}, LS0/T;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LS0/T;->b()I

    move-result p1

    goto :goto_0

    :cond_1
    instance-of v0, p1, LS0/S;

    if-eqz v0, :cond_2

    :goto_2
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :cond_2
    instance-of v0, p1, LS0/g;

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    instance-of v0, p1, LS0/h;

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    instance-of v0, p1, LS0/U;

    if-eqz v0, :cond_5

    goto :goto_2

    :cond_5
    instance-of v0, p1, LS0/n;

    if-eqz v0, :cond_6

    goto :goto_2

    :cond_6
    instance-of v0, p1, LS0/f;

    if-eqz v0, :cond_7

    goto :goto_2

    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown EditCommand: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object p1

    invoke-interface {p1}, LF7/c;->c()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_8

    const-string p1, "{anonymous EditCommand}"

    :cond_8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :goto_3
    return-object p1
.end method


# virtual methods
.method public final b(Ljava/util/List;)LS0/V;
    .locals 7

    .prologue
    const/4 v0, 0x0

    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    const/4 v2, 0x0

    move-object v3, v0

    :goto_0
    if-ge v2, v1, :cond_0

    :try_start_1
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LS0/i;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    iget-object v3, p0, LS0/k;->b:LS0/l;

    invoke-interface {v4, v3}, LS0/i;->a(LS0/l;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    add-int/lit8 v2, v2, 0x1

    move-object v3, v4

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v3, v4

    goto :goto_3

    :catch_1
    move-exception v0

    goto :goto_3

    :cond_0
    iget-object p1, p0, LS0/k;->b:LS0/l;

    invoke-virtual {p1}, LS0/l;->s()LM0/d;

    move-result-object v2

    iget-object p1, p0, LS0/k;->b:LS0/l;

    invoke-virtual {p1}, LS0/l;->i()J

    move-result-wide v3

    invoke-static {v3, v4}, LM0/N;->b(J)LM0/N;

    move-result-object p1

    invoke-virtual {p1}, LM0/N;->r()J

    iget-object v1, p0, LS0/k;->a:LS0/V;

    invoke-virtual {v1}, LS0/V;->h()J

    move-result-wide v5

    invoke-static {v5, v6}, LM0/N;->m(J)Z

    move-result v1

    if-nez v1, :cond_1

    move-object v0, p1

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, LM0/N;->r()J

    move-result-wide v0

    :goto_1
    move-wide v3, v0

    goto :goto_2

    :cond_2
    invoke-static {v3, v4}, LM0/N;->k(J)I

    move-result p1

    invoke-static {v3, v4}, LM0/N;->l(J)I

    move-result v0

    invoke-static {p1, v0}, LM0/O;->b(II)J

    move-result-wide v0

    goto :goto_1

    :goto_2
    iget-object p1, p0, LS0/k;->b:LS0/l;

    invoke-virtual {p1}, LS0/l;->d()LM0/N;

    move-result-object v5

    new-instance p1, LS0/V;

    const/4 v6, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, LS0/V;-><init>(LM0/d;JLM0/N;Ly7/k;)V

    iput-object p1, p0, LS0/k;->a:LS0/V;

    return-object p1

    :catch_2
    move-exception v1

    move-object v3, v0

    move-object v0, v1

    :goto_3
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {p0, p1, v3}, LS0/k;->c(Ljava/util/List;LS0/i;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final d(LS0/V;LS0/d0;)V
    .locals 9

    .prologue
    invoke-virtual {p1}, LS0/V;->g()LM0/N;

    move-result-object v0

    iget-object v1, p0, LS0/k;->b:LS0/l;

    invoke-virtual {v1}, LS0/l;->d()LM0/N;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    iget-object v2, p0, LS0/k;->a:LS0/V;

    invoke-virtual {v2}, LS0/V;->f()LM0/d;

    move-result-object v2

    invoke-virtual {p1}, LS0/V;->f()LM0/d;

    move-result-object v3

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    new-instance v2, LS0/l;

    invoke-virtual {p1}, LS0/V;->f()LM0/d;

    move-result-object v4

    invoke-virtual {p1}, LS0/V;->h()J

    move-result-wide v5

    const/4 v7, 0x0

    invoke-direct {v2, v4, v5, v6, v7}, LS0/l;-><init>(LM0/d;JLy7/k;)V

    iput-object v2, p0, LS0/k;->b:LS0/l;

    goto :goto_0

    :cond_0
    iget-object v2, p0, LS0/k;->a:LS0/V;

    invoke-virtual {v2}, LS0/V;->h()J

    move-result-wide v4

    invoke-virtual {p1}, LS0/V;->h()J

    move-result-wide v6

    invoke-static {v4, v5, v6, v7}, LM0/N;->g(JJ)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, LS0/k;->b:LS0/l;

    invoke-virtual {p1}, LS0/V;->h()J

    move-result-wide v4

    invoke-static {v4, v5}, LM0/N;->l(J)I

    move-result v4

    invoke-virtual {p1}, LS0/V;->h()J

    move-result-wide v5

    invoke-static {v5, v6}, LM0/N;->k(J)I

    move-result v5

    invoke-virtual {v2, v4, v5}, LS0/l;->p(II)V

    move v8, v3

    move v3, v1

    move v1, v8

    goto :goto_0

    :cond_1
    move v1, v3

    :goto_0
    invoke-virtual {p1}, LS0/V;->g()LM0/N;

    move-result-object v2

    if-nez v2, :cond_2

    iget-object v2, p0, LS0/k;->b:LS0/l;

    invoke-virtual {v2}, LS0/l;->a()V

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, LS0/V;->g()LM0/N;

    move-result-object v2

    invoke-virtual {v2}, LM0/N;->r()J

    move-result-wide v4

    invoke-static {v4, v5}, LM0/N;->h(J)Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, p0, LS0/k;->b:LS0/l;

    invoke-virtual {p1}, LS0/V;->g()LM0/N;

    move-result-object v4

    invoke-virtual {v4}, LM0/N;->r()J

    move-result-wide v4

    invoke-static {v4, v5}, LM0/N;->l(J)I

    move-result v4

    invoke-virtual {p1}, LS0/V;->g()LM0/N;

    move-result-object v5

    invoke-virtual {v5}, LM0/N;->r()J

    move-result-wide v5

    invoke-static {v5, v6}, LM0/N;->k(J)I

    move-result v5

    invoke-virtual {v2, v4, v5}, LS0/l;->n(II)V

    :cond_3
    :goto_1
    if-nez v1, :cond_4

    if-nez v3, :cond_5

    if-eqz v0, :cond_5

    :cond_4
    iget-object v0, p0, LS0/k;->b:LS0/l;

    invoke-virtual {v0}, LS0/l;->a()V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LS0/V;->d(LS0/V;LM0/d;JLM0/N;ILjava/lang/Object;)LS0/V;

    move-result-object p1

    :cond_5
    iget-object v0, p0, LS0/k;->a:LS0/V;

    iput-object p1, p0, LS0/k;->a:LS0/V;

    if-eqz p2, :cond_6

    invoke-virtual {p2, v0, p1}, LS0/d0;->d(LS0/V;LS0/V;)Z

    :cond_6
    return-void
.end method

.method public final f()LS0/V;
    .locals 1

    iget-object v0, p0, LS0/k;->a:LS0/V;

    return-object v0
.end method
