.class Lf2/c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf2/c;->i(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:Ljava/lang/Object;

.field final synthetic D:Lf2/c;


# direct methods
.method constructor <init>(Lf2/c;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lf2/c$c;->D:Lf2/c;

    iput-object p2, p0, Lf2/c$c;->C:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lf2/c$c;->D:Lf2/c;

    iget-object v1, p0, Lf2/c$c;->C:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lf2/c;->d(Ljava/lang/Object;)V

    return-void
.end method
