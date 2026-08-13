.class public final synthetic Lf4/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:LL4/b$a;


# direct methods
.method public synthetic constructor <init>(LL4/b$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/L;->C:LL4/b$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    new-instance v0, Lf4/Z0;

    const/4 v1, 0x3

    const-string v2, "Privacy options form is being loading. Please try again later."

    invoke-direct {v0, v1, v2}, Lf4/Z0;-><init>(ILjava/lang/String;)V

    invoke-virtual {v0}, Lf4/Z0;->a()LL4/e;

    move-result-object v0

    iget-object v1, p0, Lf4/L;->C:LL4/b$a;

    invoke-interface {v1, v0}, LL4/b$a;->a(LL4/e;)V

    return-void
.end method
