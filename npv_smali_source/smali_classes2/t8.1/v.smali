.class public final Lt8/v;
.super Lt8/b;
.source "SourceFile"


# instance fields
.field private final c:LF8/E;


# direct methods
.method public constructor <init>(Ljava/util/List;LF8/E;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lt8/v$a;

    invoke-direct {v0, p2}, Lt8/v$a;-><init>(LF8/E;)V

    invoke-direct {p0, p1, v0}, Lt8/b;-><init>(Ljava/util/List;Lx7/l;)V

    iput-object p2, p0, Lt8/v;->c:LF8/E;

    return-void
.end method


# virtual methods
.method public final c()LF8/E;
    .locals 1

    iget-object v0, p0, Lt8/v;->c:LF8/E;

    return-object v0
.end method
