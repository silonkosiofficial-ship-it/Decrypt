.class public final synthetic Lm5/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lm5/n$a;


# direct methods
.method public synthetic constructor <init>(Lm5/n$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm5/m;->C:Lm5/n$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lm5/m;->C:Lm5/n$a;

    invoke-static {v0}, Lm5/n$a;->a(Lm5/n$a;)V

    return-void
.end method
