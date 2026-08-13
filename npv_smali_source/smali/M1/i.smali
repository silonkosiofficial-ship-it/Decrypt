.class public final LM1/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LM1/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM1/i;

    invoke-direct {v0}, LM1/i;-><init>()V

    sput-object v0, LM1/i;->a:LM1/i;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LM1/w;LN1/b;Ljava/util/List;LW8/N;)LM1/h;
    .locals 1

    .prologue
    const-string v0, "storage"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "migrations"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, LN1/a;

    invoke-direct {p2}, LN1/a;-><init>()V

    :goto_0
    sget-object v0, LM1/g;->a:LM1/g$a;

    invoke-virtual {v0, p3}, LM1/g$a;->b(Ljava/util/List;)Lx7/p;

    move-result-object p3

    invoke-static {p3}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    new-instance v0, LM1/j;

    invoke-direct {v0, p1, p3, p2, p4}, LM1/j;-><init>(LM1/w;Ljava/util/List;LM1/d;LW8/N;)V

    return-object v0
.end method
