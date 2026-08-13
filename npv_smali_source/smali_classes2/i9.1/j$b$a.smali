.class final Li9/j$b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li9/j$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Li9/j$b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li9/j$b$a;

    invoke-direct {v0}, Li9/j$b$a;-><init>()V

    sput-object v0, Li9/j$b$a;->D:Li9/j$b$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Li9/o$c;)V
    .locals 4

    const-string v0, "$this$Format"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Li9/A;->b()Li9/n;

    move-result-object v0

    invoke-interface {p1, v0}, Li9/o$a;->s(Li9/n;)V

    const/4 v0, 0x1

    new-array v1, v0, [Lx7/l;

    sget-object v2, Li9/j$b$a$a;->D:Li9/j$b$a$a;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Li9/j$b$a$b;->D:Li9/j$b$a$b;

    invoke-static {p1, v1, v2}, Li9/p;->a(Li9/o;[Lx7/l;Lx7/l;)V

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, Li9/o$d$a;->a(Li9/o$d;Li9/K;ILjava/lang/Object;)V

    const/16 v2, 0x3a

    invoke-static {p1, v2}, Li9/p;->b(Li9/o;C)V

    invoke-static {p1, v1, v0, v1}, Li9/o$d$a;->b(Li9/o$d;Li9/K;ILjava/lang/Object;)V

    invoke-static {p1, v2}, Li9/p;->b(Li9/o;C)V

    invoke-static {p1, v1, v0, v1}, Li9/o$d$a;->c(Li9/o$d;Li9/K;ILjava/lang/Object;)V

    sget-object v2, Li9/j$b$a$c;->D:Li9/j$b$a$c;

    invoke-static {p1, v1, v2, v0, v1}, Li9/p;->d(Li9/o;Ljava/lang/String;Lx7/l;ILjava/lang/Object;)V

    new-array v0, v0, [Lx7/l;

    sget-object v1, Li9/j$b$a$d;->D:Li9/j$b$a$d;

    aput-object v1, v0, v3

    sget-object v1, Li9/j$b$a$e;->D:Li9/j$b$a$e;

    invoke-static {p1, v0, v1}, Li9/p;->a(Li9/o;[Lx7/l;Lx7/l;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li9/o$c;

    invoke-virtual {p0, p1}, Li9/j$b$a;->a(Li9/o$c;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
