.class public Lk3/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk3/g$a;
    }
.end annotation


# instance fields
.field protected final a:Ls3/f1;


# direct methods
.method protected constructor <init>(Lk3/a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ls3/f1;

    iget-object p1, p1, Lk3/a;->a:Ls3/e1;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ls3/f1;-><init>(Ls3/e1;LG3/a;)V

    iput-object v0, p0, Lk3/g;->a:Ls3/f1;

    return-void
.end method


# virtual methods
.method public final a()Ls3/f1;
    .locals 1

    iget-object v0, p0, Lk3/g;->a:Ls3/f1;

    return-object v0
.end method
