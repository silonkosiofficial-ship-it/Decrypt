.class public final synthetic Lf4/o1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:LL4/c$b;


# direct methods
.method public synthetic constructor <init>(LL4/c$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/o1;->C:LL4/c$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lf4/o1;->C:LL4/c$b;

    invoke-interface {v0}, LL4/c$b;->a()V

    return-void
.end method
