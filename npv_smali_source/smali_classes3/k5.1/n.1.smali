.class public final synthetic Lk5/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lk5/p;

.field public final synthetic D:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lk5/p;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk5/n;->C:Lk5/p;

    iput-object p2, p0, Lk5/n;->D:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lk5/n;->C:Lk5/p;

    iget-object v1, p0, Lk5/n;->D:Ljava/lang/String;

    invoke-static {v0, v1}, Lk5/p;->b(Lk5/p;Ljava/lang/String;)V

    return-void
.end method
