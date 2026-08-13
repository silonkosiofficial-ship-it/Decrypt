.class public final synthetic Lm5/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lm5/n;

.field public final synthetic D:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lm5/n;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm5/l;->C:Lm5/n;

    iput-object p2, p0, Lm5/l;->D:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lm5/l;->C:Lm5/n;

    iget-object v1, p0, Lm5/l;->D:Ljava/util/List;

    invoke-static {v0, v1}, Lm5/n;->a(Lm5/n;Ljava/util/List;)V

    return-void
.end method
