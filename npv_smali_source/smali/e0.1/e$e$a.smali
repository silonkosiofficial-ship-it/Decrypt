.class public final Le0/e$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le0/e$e;->a(LV/N;)LV/M;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Le0/e$d;

.field final synthetic b:Le0/e;

.field final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Le0/e$d;Le0/e;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Le0/e$e$a;->a:Le0/e$d;

    iput-object p2, p0, Le0/e$e$a;->b:Le0/e;

    iput-object p3, p0, Le0/e$e$a;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e()V
    .locals 2

    iget-object v0, p0, Le0/e$e$a;->a:Le0/e$d;

    iget-object v1, p0, Le0/e$e$a;->b:Le0/e;

    invoke-static {v1}, Le0/e;->b(Le0/e;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Le0/e$d;->b(Ljava/util/Map;)V

    iget-object v0, p0, Le0/e$e$a;->b:Le0/e;

    invoke-static {v0}, Le0/e;->a(Le0/e;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Le0/e$e$a;->c:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
