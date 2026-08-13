.class public final synthetic Lm5/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lm5/n;

.field public final synthetic D:Ljava/lang/String;

.field public final synthetic E:Ljava/util/Map;

.field public final synthetic F:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lm5/n;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm5/k;->C:Lm5/n;

    iput-object p2, p0, Lm5/k;->D:Ljava/lang/String;

    iput-object p3, p0, Lm5/k;->E:Ljava/util/Map;

    iput-object p4, p0, Lm5/k;->F:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lm5/k;->C:Lm5/n;

    iget-object v1, p0, Lm5/k;->D:Ljava/lang/String;

    iget-object v2, p0, Lm5/k;->E:Ljava/util/Map;

    iget-object v3, p0, Lm5/k;->F:Ljava/util/List;

    invoke-static {v0, v1, v2, v3}, Lm5/n;->b(Lm5/n;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V

    return-void
.end method
