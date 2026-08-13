.class final Lf4/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf4/V0;


# instance fields
.field final synthetic a:Lf4/h;


# direct methods
.method constructor <init>(Lf4/h;)V
    .locals 0

    iput-object p1, p0, Lf4/f;->a:Lf4/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lf4/f;->a:Lf4/h;

    new-instance v1, Lf4/l;

    invoke-static {v0}, Lf4/h;->d(Lf4/h;)Lf4/h;

    move-result-object v0

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lf4/l;-><init>(Lf4/h;Lf4/k;)V

    return-object v1
.end method
