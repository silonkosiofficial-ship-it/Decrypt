.class final Li9/X$b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li9/X$b;->a()Li9/W;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Li9/X$b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li9/X$b$a;

    invoke-direct {v0}, Li9/X$b$a;-><init>()V

    sput-object v0, Li9/X$b$a;->D:Li9/X$b$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Li9/o$e;)V
    .locals 3

    const-string v0, "$this$build"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    new-array v0, v0, [Lx7/l;

    sget-object v1, Li9/X$b$a$a;->D:Li9/X$b$a$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Li9/X$b$a$b;->D:Li9/X$b$a$b;

    invoke-static {p1, v0, v1}, Li9/p;->a(Li9/o;[Lx7/l;Lx7/l;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li9/o$e;

    invoke-virtual {p0, p1}, Li9/X$b$a;->a(Li9/o$e;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
