.class LN7/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP8/b$c;


# instance fields
.field private final a:LN7/i;


# direct methods
.method public constructor <init>(LN7/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN7/h;->a:LN7/i;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/lang/Iterable;
    .locals 1

    iget-object v0, p0, LN7/h;->a:LN7/i;

    check-cast p1, LO7/e;

    invoke-static {v0, p1}, LN7/i;->j(LN7/i;LO7/e;)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method
