.class final synthetic LI7/k$e;
.super Ly7/p;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/k;->t(I)LO7/U;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final L:LI7/k$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI7/k$e;

    invoke-direct {v0}, LI7/k$e;-><init>()V

    sput-object v0, LI7/k$e;->L:LI7/k$e;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/p;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "loadProperty"

    return-object v0
.end method

.method public final k()LF7/e;
    .locals 1

    const-class v0, LB8/x;

    invoke-static {v0}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v0

    return-object v0
.end method

.method public final n()Ljava/lang/String;
    .locals 1

    const-string v0, "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;"

    return-object v0
.end method

.method public final s(LB8/x;Li8/n;)LO7/U;
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p1"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, LB8/x;->l(Li8/n;)LO7/U;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LB8/x;

    check-cast p2, Li8/n;

    invoke-virtual {p0, p1, p2}, LI7/k$e;->s(LB8/x;Li8/n;)LO7/U;

    move-result-object p1

    return-object p1
.end method
