.class public final synthetic Lf4/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lf4/P;

.field public final synthetic D:Lf4/D;


# direct methods
.method public synthetic constructor <init>(Lf4/P;Lf4/D;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/F;->C:Lf4/P;

    iput-object p2, p0, Lf4/F;->D:Lf4/D;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lf4/F;->C:Lf4/P;

    iget-object v1, p0, Lf4/F;->D:Lf4/D;

    invoke-virtual {v0, v1}, Lf4/P;->a(Lf4/D;)V

    return-void
.end method
