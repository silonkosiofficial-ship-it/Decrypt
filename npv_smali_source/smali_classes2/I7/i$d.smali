.class public final LI7/i$d;
.super LI7/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI7/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field private final a:LI7/h$e;

.field private final b:LI7/h$e;


# direct methods
.method public constructor <init>(LI7/h$e;LI7/h$e;)V
    .locals 1

    const-string v0, "getterSignature"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LI7/i;-><init>(Ly7/k;)V

    iput-object p1, p0, LI7/i$d;->a:LI7/h$e;

    iput-object p2, p0, LI7/i$d;->b:LI7/h$e;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LI7/i$d;->a:LI7/h$e;

    invoke-virtual {v0}, LI7/h$e;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b()LI7/h$e;
    .locals 1

    iget-object v0, p0, LI7/i$d;->a:LI7/h$e;

    return-object v0
.end method

.method public final c()LI7/h$e;
    .locals 1

    iget-object v0, p0, LI7/i$d;->b:LI7/h$e;

    return-object v0
.end method
