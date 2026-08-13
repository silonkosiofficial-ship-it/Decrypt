.class public final synthetic Le5/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF5/b;


# instance fields
.field public final synthetic a:Le5/o;

.field public final synthetic b:Le5/c;


# direct methods
.method public synthetic constructor <init>(Le5/o;Le5/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le5/l;->a:Le5/o;

    iput-object p2, p0, Le5/l;->b:Le5/c;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Le5/l;->a:Le5/o;

    iget-object v1, p0, Le5/l;->b:Le5/c;

    invoke-static {v0, v1}, Le5/o;->j(Le5/o;Le5/c;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
