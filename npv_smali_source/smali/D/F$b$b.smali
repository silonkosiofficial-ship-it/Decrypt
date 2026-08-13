.class final LD/F$b$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD/F$b;->a(Le0/g;)Le0/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Le0/g;


# direct methods
.method constructor <init>(Le0/g;)V
    .locals 0

    iput-object p1, p0, LD/F$b$b;->D:Le0/g;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Map;)LD/F;
    .locals 2

    new-instance v0, LD/F;

    iget-object v1, p0, LD/F$b$b;->D:Le0/g;

    invoke-direct {v0, v1, p1}, LD/F;-><init>(Le0/g;Ljava/util/Map;)V

    return-object v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Map;

    invoke-virtual {p0, p1}, LD/F$b$b;->a(Ljava/util/Map;)LD/F;

    move-result-object p1

    return-object p1
.end method
