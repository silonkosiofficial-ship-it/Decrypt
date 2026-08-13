.class public final synthetic Lz9/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic C:Lv9/f;

.field public final synthetic D:Ly9/b;


# direct methods
.method public synthetic constructor <init>(Lv9/f;Ly9/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz9/H;->C:Lv9/f;

    iput-object p2, p0, Lz9/H;->D:Ly9/b;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lz9/H;->C:Lv9/f;

    iget-object v1, p0, Lz9/H;->D:Ly9/b;

    invoke-static {v0, v1}, Lz9/I;->a(Lv9/f;Ly9/b;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
