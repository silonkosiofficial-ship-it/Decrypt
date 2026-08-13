.class public final synthetic Lw3/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw3/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(ILjava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lw3/k;->a:I

    iput-object p2, p0, Lw3/k;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a(Landroid/util/JsonWriter;)V
    .locals 2

    iget v0, p0, Lw3/k;->a:I

    iget-object v1, p0, Lw3/k;->b:Ljava/util/Map;

    invoke-static {v0, v1, p1}, Lw3/m;->b(ILjava/util/Map;Landroid/util/JsonWriter;)V

    return-void
.end method
