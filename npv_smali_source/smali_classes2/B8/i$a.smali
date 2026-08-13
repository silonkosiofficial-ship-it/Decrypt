.class final LB8/i$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LB8/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Ln8/b;

.field private final b:LB8/g;


# direct methods
.method public constructor <init>(Ln8/b;LB8/g;)V
    .locals 1

    const-string v0, "classId"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB8/i$a;->a:Ln8/b;

    iput-object p2, p0, LB8/i$a;->b:LB8/g;

    return-void
.end method


# virtual methods
.method public final a()LB8/g;
    .locals 1

    iget-object v0, p0, LB8/i$a;->b:LB8/g;

    return-object v0
.end method

.method public final b()Ln8/b;
    .locals 1

    iget-object v0, p0, LB8/i$a;->a:Ln8/b;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    instance-of v0, p1, LB8/i$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, LB8/i$a;->a:Ln8/b;

    check-cast p1, LB8/i$a;

    iget-object p1, p1, LB8/i$a;->a:Ln8/b;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LB8/i$a;->a:Ln8/b;

    invoke-virtual {v0}, Ln8/b;->hashCode()I

    move-result v0

    return v0
.end method
