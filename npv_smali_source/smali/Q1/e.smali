.class public final LQ1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LQ1/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LQ1/e;

    invoke-direct {v0}, LQ1/e;-><init>()V

    sput-object v0, LQ1/e;->a:LQ1/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LM1/w;LN1/b;Ljava/util/List;LW8/N;)LM1/h;
    .locals 2

    const-string v0, "storage"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "migrations"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LQ1/d;

    sget-object v1, LM1/i;->a:LM1/i;

    invoke-virtual {v1, p1, p2, p3, p4}, LM1/i;->a(LM1/w;LN1/b;Ljava/util/List;LW8/N;)LM1/h;

    move-result-object p1

    invoke-direct {v0, p1}, LQ1/d;-><init>(LM1/h;)V

    return-object v0
.end method

.method public final b(LN1/b;Ljava/util/List;LW8/N;Lx7/a;)LM1/h;
    .locals 8

    const-string v0, "migrations"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "produceFile"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LO1/d;

    sget-object v2, LX9/k;->b:LX9/k;

    sget-object v3, LQ1/j;->a:LQ1/j;

    new-instance v5, LQ1/e$a;

    invoke-direct {v5, p4}, LQ1/e$a;-><init>(Lx7/a;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, LO1/d;-><init>(LX9/k;LO1/c;Lx7/p;Lx7/a;ILy7/k;)V

    invoke-virtual {p0, v0, p1, p2, p3}, LQ1/e;->a(LM1/w;LN1/b;Ljava/util/List;LW8/N;)LM1/h;

    move-result-object p1

    new-instance p2, LQ1/d;

    invoke-direct {p2, p1}, LQ1/d;-><init>(LM1/h;)V

    return-object p2
.end method
