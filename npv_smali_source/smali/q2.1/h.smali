.class final Lq2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:Lx7/a;

.field private final c:LV8/c;

.field private final d:[Lq2/f;

.field private final e:LY8/j;


# direct methods
.method public constructor <init>(ILx7/a;)V
    .locals 2

    const-string v0, "connectionFactory"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lq2/h;->a:I

    iput-object p2, p0, Lq2/h;->b:Lx7/a;

    const/4 p2, 0x0

    invoke-static {p2}, LV8/b;->c(I)LV8/c;

    move-result-object p2

    iput-object p2, p0, Lq2/h;->c:LV8/c;

    new-array p2, p1, [Lq2/f;

    iput-object p2, p0, Lq2/h;->d:[Lq2/f;

    new-instance p2, Lq2/h$a;

    invoke-direct {p2, p0}, Lq2/h$a;-><init>(Lq2/h;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, v1, p2, v0, v1}, LY8/m;->b(ILY8/d;Lx7/l;ILjava/lang/Object;)LY8/j;

    move-result-object p1

    iput-object p1, p0, Lq2/h;->e:LY8/j;

    return-void
.end method

.method private final e()V
    .locals 5

    .prologue
    iget-object v0, p0, Lq2/h;->c:LV8/c;

    invoke-virtual {v0}, LV8/c;->c()I

    move-result v0

    iget v1, p0, Lq2/h;->a:I

    if-lt v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lq2/h;->c:LV8/c;

    add-int/lit8 v2, v0, 0x1

    invoke-virtual {v1, v0, v2}, LV8/c;->a(II)Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v1, Lq2/f;

    iget-object v2, p0, Lq2/h;->b:Lx7/a;

    invoke-interface {v2}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly2/b;

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-direct {v1, v2, v4, v3, v4}, Lq2/f;-><init>(Ly2/b;Lf9/a;ILy7/k;)V

    iget-object v2, p0, Lq2/h;->e:LY8/j;

    invoke-interface {v2, v1}, LY8/C;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, LY8/n;->j(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v2, p0, Lq2/h;->d:[Lq2/f;

    aput-object v1, v2, v0

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lq2/f;->close()V

    invoke-static {v2}, LY8/n;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Couldn\'t send a new connection for acquisition"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-direct {p0}, Lq2/h;->e()V

    :goto_0
    return-void
.end method


# virtual methods
.method public final a(Lm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    iget-object v0, p0, Lq2/h;->e:LY8/j;

    invoke-interface {v0}, LY8/B;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LY8/n;->j(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, LY8/n;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq2/f;

    return-object p1

    :cond_0
    invoke-direct {p0}, Lq2/h;->e()V

    iget-object v0, p0, Lq2/h;->e:LY8/j;

    invoke-interface {v0, p1}, LY8/B;->b(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b()V
    .locals 4

    .prologue
    iget-object v0, p0, Lq2/h;->e:LY8/j;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LY8/C$a;->a(LY8/C;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    iget-object v0, p0, Lq2/h;->d:[Lq2/f;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lq2/f;->close()V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final c(Ljava/lang/StringBuilder;)V
    .locals 10

    .prologue
    const-string v0, "builder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " (capacity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lq2/h;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "append(value)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0xa

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, "append(\'\\n\')"

    invoke-static {p1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lq2/h;->d:[Lq2/f;

    array-length v4, v3

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    if-ge v5, v4, :cond_2

    aget-object v7, v3, v5

    add-int/lit8 v6, v6, 0x1

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "\t\t["

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, "] - "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v7, :cond_0

    invoke-virtual {v7}, Lq2/f;->toString()Ljava/lang/String;

    move-result-object v9

    goto :goto_1

    :cond_0
    const/4 v9, 0x0

    :goto_1
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v7, :cond_1

    invoke-virtual {v7, p1}, Lq2/f;->f(Ljava/lang/StringBuilder;)V

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final d(Lq2/f;)V
    .locals 2

    .prologue
    const-string v0, "connection"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq2/h;->e:LY8/j;

    invoke-interface {v0, p1}, LY8/C;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LY8/n;->j(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lq2/f;->close()V

    invoke-static {v0}, LY8/n;->i(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Couldn\'t recycle connection"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method
