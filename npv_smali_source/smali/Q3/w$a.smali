.class public LQ3/w$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQ3/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method synthetic constructor <init>(LQ3/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LQ3/w;
    .locals 3

    new-instance v0, LQ3/w;

    iget-object v1, p0, LQ3/w$a;->a:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LQ3/w;-><init>(Ljava/lang/String;LQ3/z;)V

    return-object v0
.end method

.method public b(Ljava/lang/String;)LQ3/w$a;
    .locals 0

    iput-object p1, p0, LQ3/w$a;->a:Ljava/lang/String;

    return-object p0
.end method
