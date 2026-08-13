.class public final LI6/K;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ6/a;


# static fields
.field public static final a:LI6/K;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI6/K;

    invoke-direct {v0}, LI6/K;-><init>()V

    sput-object v0, LI6/K;->a:LI6/K;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(LC6/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lx7/q;

    invoke-virtual {p0, p1, p2}, LI6/K;->b(LC6/c;Lx7/q;)V

    return-void
.end method

.method public b(LC6/c;Lx7/q;)V
    .locals 3

    const-string v0, "client"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handler"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La7/i;

    const-string v1, "BeforeReceive"

    invoke-direct {v0, v1}, La7/i;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, LC6/c;->H()LQ6/f;

    move-result-object v1

    sget-object v2, LQ6/f;->g:LQ6/f$a;

    invoke-virtual {v2}, LQ6/f$a;->b()La7/i;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, La7/d;->k(La7/i;La7/i;)V

    invoke-virtual {p1}, LC6/c;->H()LQ6/f;

    move-result-object p1

    new-instance v1, LI6/K$a;

    const/4 v2, 0x0

    invoke-direct {v1, p2, v2}, LI6/K$a;-><init>(Lx7/q;Lm7/e;)V

    invoke-virtual {p1, v0, v1}, La7/d;->l(La7/i;Lx7/q;)V

    return-void
.end method
