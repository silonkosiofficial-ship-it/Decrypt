.class public final Lg8/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD8/f;


# instance fields
.field private final b:Lw8/d;

.field private final c:Lw8/d;

.field private final d:LB8/t;

.field private final e:Z

.field private final f:LD8/e;

.field private final g:Lg8/t;

.field private final h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lg8/t;Li8/l;Lk8/c;LB8/t;ZLD8/e;)V
    .locals 10

    .prologue
    const-string v0, "kotlinClass"

    move-object v9, p1

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packageProto"

    move-object v4, p2

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    move-object v5, p3

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "abiStability"

    move-object/from16 v8, p6

    invoke-static {v8, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lg8/t;->c()Ln8/b;

    move-result-object v0

    invoke-static {v0}, Lw8/d;->b(Ln8/b;)Lw8/d;

    move-result-object v2

    const-string v0, "byClassId(...)"

    invoke-static {v2, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lg8/t;->b()Lh8/a;

    move-result-object v0

    invoke-virtual {v0}, Lh8/a;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-lez v3, :cond_0

    invoke-static {v0}, Lw8/d;->d(Ljava/lang/String;)Lw8/d;

    move-result-object v1

    :cond_0
    move-object v3, v1

    move-object v1, p0

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move v7, p5

    move-object/from16 v8, p6

    move-object v9, p1

    invoke-direct/range {v1 .. v9}, Lg8/n;-><init>(Lw8/d;Lw8/d;Li8/l;Lk8/c;LB8/t;ZLD8/e;Lg8/t;)V

    return-void
.end method

.method public constructor <init>(Lw8/d;Lw8/d;Li8/l;Lk8/c;LB8/t;ZLD8/e;Lg8/t;)V
    .locals 1

    .prologue
    const-string v0, "className"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packageProto"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "abiStability"

    invoke-static {p7, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/n;->b:Lw8/d;

    iput-object p2, p0, Lg8/n;->c:Lw8/d;

    iput-object p5, p0, Lg8/n;->d:LB8/t;

    iput-boolean p6, p0, Lg8/n;->e:Z

    iput-object p7, p0, Lg8/n;->f:LD8/e;

    iput-object p8, p0, Lg8/n;->g:Lg8/t;

    sget-object p1, Ll8/a;->m:Lp8/i$f;

    const-string p2, "packageModuleName"

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, p1}, Lk8/e;->a(Lp8/i$d;Lp8/i$f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-interface {p4, p1}, Lk8/c;->getString(I)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    const-string p1, "main"

    :cond_1
    iput-object p1, p0, Lg8/n;->h:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()LO7/b0;
    .locals 2

    sget-object v0, LO7/b0;->a:LO7/b0;

    const-string v1, "NO_SOURCE_FILE"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Class \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lg8/n;->d()Ln8/b;

    move-result-object v1

    invoke-virtual {v1}, Ln8/b;->b()Ln8/c;

    move-result-object v1

    invoke-virtual {v1}, Ln8/c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d()Ln8/b;
    .locals 3

    new-instance v0, Ln8/b;

    invoke-virtual {p0}, Lg8/n;->e()Lw8/d;

    move-result-object v1

    invoke-virtual {v1}, Lw8/d;->g()Ln8/c;

    move-result-object v1

    invoke-virtual {p0}, Lg8/n;->h()Ln8/f;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ln8/b;-><init>(Ln8/c;Ln8/f;)V

    return-object v0
.end method

.method public e()Lw8/d;
    .locals 1

    iget-object v0, p0, Lg8/n;->b:Lw8/d;

    return-object v0
.end method

.method public f()Lw8/d;
    .locals 1

    iget-object v0, p0, Lg8/n;->c:Lw8/d;

    return-object v0
.end method

.method public final g()Lg8/t;
    .locals 1

    iget-object v0, p0, Lg8/n;->g:Lg8/t;

    return-object v0
.end method

.method public final h()Ln8/f;
    .locals 4

    invoke-virtual {p0}, Lg8/n;->e()Lw8/d;

    move-result-object v0

    invoke-virtual {v0}, Lw8/d;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getInternalName(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/16 v3, 0x2f

    invoke-static {v0, v3, v1, v2, v1}, LS8/r;->l1(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v0

    const-string v1, "identifier(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lg8/n;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lg8/n;->e()Lw8/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
