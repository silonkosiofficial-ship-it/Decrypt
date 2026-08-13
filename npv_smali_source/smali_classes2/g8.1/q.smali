.class final Lg8/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg8/p;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg8/q$a;
    }
.end annotation


# static fields
.field public static final a:Lg8/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg8/q;

    invoke-direct {v0}, Lg8/q;-><init>()V

    sput-object v0, Lg8/q;->a:Lg8/q;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(LL7/h;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lg8/q;->j(LL7/h;)Lg8/o;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p1, Lg8/o;

    invoke-virtual {p0, p1}, Lg8/q;->l(Lg8/o;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lg8/q;->h(Ljava/lang/String;)Lg8/o;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lg8/q;->i(Ljava/lang/String;)Lg8/o$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lg8/o;

    invoke-virtual {p0, p1}, Lg8/q;->g(Lg8/o;)Lg8/o;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lg8/q;->k()Lg8/o;

    move-result-object v0

    return-object v0
.end method

.method public g(Lg8/o;)Lg8/o;
    .locals 2

    .prologue
    const-string v0, "possiblyPrimitiveType"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lg8/o$d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lg8/o$d;

    invoke-virtual {v0}, Lg8/o$d;->i()Lw8/e;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lg8/o$d;->i()Lw8/e;

    move-result-object p1

    invoke-virtual {p1}, Lw8/e;->q()Ln8/c;

    move-result-object p1

    invoke-static {p1}, Lw8/d;->c(Ln8/c;)Lw8/d;

    move-result-object p1

    invoke-virtual {p1}, Lw8/d;->f()Ljava/lang/String;

    move-result-object p1

    const-string v0, "getInternalName(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lg8/q;->i(Ljava/lang/String;)Lg8/o$c;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public h(Ljava/lang/String;)Lg8/o;
    .locals 8

    .prologue
    const-string v0, "representation"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {}, Lw8/e;->values()[Lw8/e;

    move-result-object v2

    array-length v3, v2

    move v4, v0

    :goto_0
    const/4 v5, 0x0

    if-ge v4, v3, :cond_1

    aget-object v6, v2, v4

    invoke-virtual {v6}, Lw8/e;->m()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v0}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-ne v7, v1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    move-object v6, v5

    :goto_1
    if-eqz v6, :cond_2

    new-instance p1, Lg8/o$d;

    invoke-direct {p1, v6}, Lg8/o$d;-><init>(Lw8/e;)V

    return-object p1

    :cond_2
    const/16 v2, 0x56

    if-ne v1, v2, :cond_3

    new-instance p1, Lg8/o$d;

    invoke-direct {p1, v5}, Lg8/o$d;-><init>(Lw8/e;)V

    goto :goto_3

    :cond_3
    const/16 v2, 0x5b

    const-string v3, "substring(...)"

    const/4 v4, 0x1

    if-ne v1, v2, :cond_4

    new-instance v0, Lg8/o$a;

    invoke-virtual {p1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lg8/q;->h(Ljava/lang/String;)Lg8/o;

    move-result-object p1

    invoke-direct {v0, p1}, Lg8/o$a;-><init>(Lg8/o;)V

    :goto_2
    move-object p1, v0

    goto :goto_3

    :cond_4
    const/16 v2, 0x4c

    if-ne v1, v2, :cond_5

    const/16 v1, 0x3b

    const/4 v2, 0x2

    invoke-static {p1, v1, v0, v2, v5}, LS8/r;->f0(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v0

    :cond_5
    new-instance v0, Lg8/o$c;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v1, v4

    invoke-virtual {p1, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, Lg8/o$c;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_3
    return-object p1
.end method

.method public i(Ljava/lang/String;)Lg8/o$c;
    .locals 1

    const-string v0, "internalName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lg8/o$c;

    invoke-direct {v0, p1}, Lg8/o$c;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public j(LL7/h;)Lg8/o;
    .locals 1

    .prologue
    const-string v0, "primitiveType"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lg8/q$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Lg8/o;->a:Lg8/o$b;

    invoke-virtual {p1}, Lg8/o$b;->d()Lg8/o$d;

    move-result-object p1

    goto :goto_0

    :pswitch_1
    sget-object p1, Lg8/o;->a:Lg8/o$b;

    invoke-virtual {p1}, Lg8/o$b;->g()Lg8/o$d;

    move-result-object p1

    goto :goto_0

    :pswitch_2
    sget-object p1, Lg8/o;->a:Lg8/o$b;

    invoke-virtual {p1}, Lg8/o$b;->e()Lg8/o$d;

    move-result-object p1

    goto :goto_0

    :pswitch_3
    sget-object p1, Lg8/o;->a:Lg8/o$b;

    invoke-virtual {p1}, Lg8/o$b;->f()Lg8/o$d;

    move-result-object p1

    goto :goto_0

    :pswitch_4
    sget-object p1, Lg8/o;->a:Lg8/o$b;

    invoke-virtual {p1}, Lg8/o$b;->h()Lg8/o$d;

    move-result-object p1

    goto :goto_0

    :pswitch_5
    sget-object p1, Lg8/o;->a:Lg8/o$b;

    invoke-virtual {p1}, Lg8/o$b;->b()Lg8/o$d;

    move-result-object p1

    goto :goto_0

    :pswitch_6
    sget-object p1, Lg8/o;->a:Lg8/o$b;

    invoke-virtual {p1}, Lg8/o$b;->c()Lg8/o$d;

    move-result-object p1

    goto :goto_0

    :pswitch_7
    sget-object p1, Lg8/o;->a:Lg8/o$b;

    invoke-virtual {p1}, Lg8/o$b;->a()Lg8/o$d;

    move-result-object p1

    :goto_0
    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public k()Lg8/o;
    .locals 1

    const-string v0, "java/lang/Class"

    invoke-virtual {p0, v0}, Lg8/q;->i(Ljava/lang/String;)Lg8/o$c;

    move-result-object v0

    return-object v0
.end method

.method public l(Lg8/o;)Ljava/lang/String;
    .locals 2

    .prologue
    const-string v0, "type"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lg8/o$a;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    check-cast p1, Lg8/o$a;

    invoke-virtual {p1}, Lg8/o$a;->i()Lg8/o;

    move-result-object p1

    invoke-virtual {p0, p1}, Lg8/q;->l(Lg8/o;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lg8/o$d;

    if-eqz v0, :cond_2

    check-cast p1, Lg8/o$d;

    invoke-virtual {p1}, Lg8/o$d;->i()Lw8/e;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lw8/e;->m()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    :cond_1
    const-string p1, "V"

    goto :goto_1

    :cond_2
    instance-of v0, p1, Lg8/o$c;

    if-eqz v0, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x4c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    check-cast p1, Lg8/o$c;

    invoke-virtual {p1}, Lg8/o$c;->i()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x3b

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_3
    :goto_1
    return-object p1

    :cond_4
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1
.end method
