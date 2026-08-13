.class public final LJ6/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ6/a;


# static fields
.field public static final a:LJ6/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LJ6/n;

    invoke-direct {v0}, LJ6/n;-><init>()V

    sput-object v0, LJ6/n;->a:LJ6/n;

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

    check-cast p2, Lx7/s;

    invoke-virtual {p0, p1, p2}, LJ6/n;->b(LC6/c;Lx7/s;)V

    return-void
.end method

.method public b(LC6/c;Lx7/s;)V
    .locals 3

    const-string v0, "client"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handler"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LC6/c;->H()LQ6/f;

    move-result-object p1

    sget-object v0, LQ6/f;->g:LQ6/f$a;

    invoke-virtual {v0}, LQ6/f$a;->c()La7/i;

    move-result-object v0

    new-instance v1, LJ6/n$a;

    const/4 v2, 0x0

    invoke-direct {v1, p2, v2}, LJ6/n$a;-><init>(Lx7/s;Lm7/e;)V

    invoke-virtual {p1, v0, v1}, La7/d;->l(La7/i;Lx7/q;)V

    return-void
.end method
