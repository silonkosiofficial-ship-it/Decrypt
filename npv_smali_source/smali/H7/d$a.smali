.class final synthetic LH7/d$a;
.super Ly7/p;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH7/d;->a(Li7/i;)LF7/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final L:LH7/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LH7/d$a;

    invoke-direct {v0}, LH7/d$a;-><init>()V

    sput-object v0, LH7/d$a;->L:LH7/d$a;

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

    const-string v0, "loadFunction"

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

    const-string v0, "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;"

    return-object v0
.end method

.method public final s(LB8/x;Li8/i;)LO7/Z;
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p1"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, LB8/x;->j(Li8/i;)LO7/Z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LB8/x;

    check-cast p2, Li8/i;

    invoke-virtual {p0, p1, p2}, LH7/d$a;->s(LB8/x;Li8/i;)LO7/Z;

    move-result-object p1

    return-object p1
.end method
