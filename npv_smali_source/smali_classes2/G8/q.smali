.class final LG8/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LF8/E;

.field private final b:LG8/q;


# direct methods
.method public constructor <init>(LF8/E;LG8/q;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG8/q;->a:LF8/E;

    iput-object p2, p0, LG8/q;->b:LG8/q;

    return-void
.end method


# virtual methods
.method public final a()LG8/q;
    .locals 1

    iget-object v0, p0, LG8/q;->b:LG8/q;

    return-object v0
.end method

.method public final b()LF8/E;
    .locals 1

    iget-object v0, p0, LG8/q;->a:LF8/E;

    return-object v0
.end method
