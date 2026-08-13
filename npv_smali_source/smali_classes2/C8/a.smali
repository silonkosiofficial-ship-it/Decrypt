.class public final LC8/a;
.super LA8/a;
.source "SourceFile"


# static fields
.field public static final r:LC8/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LC8/a;

    invoke-direct {v0}, LC8/a;-><init>()V

    sput-object v0, LC8/a;->r:LC8/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 18

    move-object/from16 v0, p0

    invoke-static {}, Lp8/g;->d()Lp8/g;

    move-result-object v2

    move-object v1, v2

    invoke-static {v2}, Lj8/b;->a(Lp8/g;)V

    const-string v3, "apply(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lj8/b;->a:Lp8/i$f;

    move-object v2, v3

    const-string v4, "packageFqName"

    invoke-static {v3, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lj8/b;->c:Lp8/i$f;

    move-object v3, v4

    const-string v5, "constructorAnnotation"

    invoke-static {v4, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Lj8/b;->b:Lp8/i$f;

    move-object v4, v5

    const-string v6, "classAnnotation"

    invoke-static {v5, v6}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lj8/b;->d:Lp8/i$f;

    move-object v5, v6

    const-string v7, "functionAnnotation"

    invoke-static {v6, v7}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lj8/b;->e:Lp8/i$f;

    move-object v7, v6

    const-string v8, "propertyAnnotation"

    invoke-static {v6, v8}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lj8/b;->f:Lp8/i$f;

    move-object v8, v6

    const-string v9, "propertyGetterAnnotation"

    invoke-static {v6, v9}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lj8/b;->g:Lp8/i$f;

    move-object v9, v6

    const-string v10, "propertySetterAnnotation"

    invoke-static {v6, v10}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lj8/b;->i:Lp8/i$f;

    move-object v13, v6

    const-string v10, "enumEntryAnnotation"

    invoke-static {v6, v10}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lj8/b;->h:Lp8/i$f;

    move-object v14, v6

    const-string v10, "compileTimeValue"

    invoke-static {v6, v10}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lj8/b;->j:Lp8/i$f;

    move-object v15, v6

    const-string v10, "parameterAnnotation"

    invoke-static {v6, v10}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lj8/b;->k:Lp8/i$f;

    move-object/from16 v16, v6

    const-string v10, "typeAnnotation"

    invoke-static {v6, v10}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lj8/b;->l:Lp8/i$f;

    move-object/from16 v17, v6

    const-string v10, "typeParameterAnnotation"

    invoke-static {v6, v10}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v0 .. v17}, LA8/a;-><init>(Lp8/g;Lp8/i$f;Lp8/i$f;Lp8/i$f;Lp8/i$f;Lp8/i$f;Lp8/i$f;Lp8/i$f;Lp8/i$f;Lp8/i$f;Lp8/i$f;Lp8/i$f;Lp8/i$f;Lp8/i$f;Lp8/i$f;Lp8/i$f;Lp8/i$f;)V

    return-void
.end method

.method private final s(Ln8/c;)Ljava/lang/String;
    .locals 1

    .prologue
    invoke-virtual {p1}, Ln8/c;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "default-package"

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ln8/c;->g()Ln8/f;

    move-result-object p1

    invoke-virtual {p1}, Ln8/f;->g()Ljava/lang/String;

    move-result-object p1

    const-string v0, "asString(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method


# virtual methods
.method public final q(Ln8/c;)Ljava/lang/String;
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, p1}, LC8/a;->s(Ln8/c;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".kotlin_builtins"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final r(Ln8/c;)Ljava/lang/String;
    .locals 7

    const-string v0, "fqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ln8/c;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "asString(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/16 v2, 0x2e

    const/16 v3, 0x2f

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LS8/r;->Q(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, LC8/a;->q(Ln8/c;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
