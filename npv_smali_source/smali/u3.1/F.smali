.class public final synthetic Lu3/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lu3/H;

.field public final synthetic D:Ljava/lang/String;

.field public final synthetic E:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lu3/H;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu3/F;->C:Lu3/H;

    iput-object p2, p0, Lu3/F;->D:Ljava/lang/String;

    iput-object p3, p0, Lu3/F;->E:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lu3/F;->C:Lu3/H;

    iget-object v1, p0, Lu3/F;->D:Ljava/lang/String;

    iget-object v2, p0, Lu3/F;->E:Ljava/util/Map;

    invoke-virtual {v0, v1, v2}, Lu3/H;->h(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
