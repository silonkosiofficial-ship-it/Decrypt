.class public final synthetic Le3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh3/b$a;


# instance fields
.field public final synthetic a:Le3/c;

.field public final synthetic b:LY2/p;

.field public final synthetic c:LY2/i;


# direct methods
.method public synthetic constructor <init>(Le3/c;LY2/p;LY2/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le3/b;->a:Le3/c;

    iput-object p2, p0, Le3/b;->b:LY2/p;

    iput-object p3, p0, Le3/b;->c:LY2/i;

    return-void
.end method


# virtual methods
.method public final n()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Le3/b;->a:Le3/c;

    iget-object v1, p0, Le3/b;->b:LY2/p;

    iget-object v2, p0, Le3/b;->c:LY2/i;

    invoke-static {v0, v1, v2}, Le3/c;->b(Le3/c;LY2/p;LY2/i;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
