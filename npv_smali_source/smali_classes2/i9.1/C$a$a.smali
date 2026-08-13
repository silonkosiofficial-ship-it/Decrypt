.class final Li9/C$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li9/C$a;->a()Li9/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Li9/C$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li9/C$a$a;

    invoke-direct {v0}, Li9/C$a$a;-><init>()V

    sput-object v0, Li9/C$a$a;->D:Li9/C$a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Li9/o$b;)V
    .locals 3

    const-string v0, "$this$build"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Li9/A;->b()Li9/n;

    move-result-object v0

    invoke-interface {p1, v0}, Li9/o$a;->s(Li9/n;)V

    const/4 v0, 0x1

    new-array v0, v0, [Lx7/l;

    sget-object v1, Li9/C$a$a$a;->D:Li9/C$a$a$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Li9/C$a$a$b;->D:Li9/C$a$a$b;

    invoke-static {p1, v0, v1}, Li9/p;->a(Li9/o;[Lx7/l;Lx7/l;)V

    invoke-static {}, Li9/E;->b()Li9/D;

    move-result-object v0

    invoke-interface {p1, v0}, Li9/o$d;->k(Li9/n;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li9/o$b;

    invoke-virtual {p0, p1}, Li9/C$a$a;->a(Li9/o$b;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
