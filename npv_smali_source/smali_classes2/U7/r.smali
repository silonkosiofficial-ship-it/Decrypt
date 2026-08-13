.class public final LU7/r;
.super LU7/t;
.source "SourceFile"

# interfaces
.implements Le8/n;


# instance fields
.field private final a:Ljava/lang/reflect/Field;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Field;)V
    .locals 1

    const-string v0, "member"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LU7/t;-><init>()V

    iput-object p1, p0, LU7/r;->a:Ljava/lang/reflect/Field;

    return-void
.end method


# virtual methods
.method public L()Z
    .locals 1

    invoke-virtual {p0}, LU7/r;->a0()Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->isEnumConstant()Z

    move-result v0

    return v0
.end method

.method public U()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic Y()Ljava/lang/reflect/Member;
    .locals 1

    invoke-virtual {p0}, LU7/r;->a0()Ljava/lang/reflect/Field;

    move-result-object v0

    return-object v0
.end method

.method public a0()Ljava/lang/reflect/Field;
    .locals 1

    iget-object v0, p0, LU7/r;->a:Ljava/lang/reflect/Field;

    return-object v0
.end method

.method public b0()LU7/z;
    .locals 3

    sget-object v0, LU7/z;->a:LU7/z$a;

    invoke-virtual {p0}, LU7/r;->a0()Ljava/lang/reflect/Field;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    move-result-object v1

    const-string v2, "getGenericType(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LU7/z$a;->a(Ljava/lang/reflect/Type;)LU7/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getType()Le8/x;
    .locals 1

    invoke-virtual {p0}, LU7/r;->b0()LU7/z;

    move-result-object v0

    return-object v0
.end method
