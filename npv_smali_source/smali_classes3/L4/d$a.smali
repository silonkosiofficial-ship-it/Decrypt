.class public final LL4/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LL4/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Z

.field private b:Ljava/lang/String;

.field private c:LL4/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static bridge synthetic b(LL4/d$a;)LL4/a;
    .locals 0

    iget-object p0, p0, LL4/d$a;->c:LL4/a;

    return-object p0
.end method

.method static bridge synthetic c(LL4/d$a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LL4/d$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method static bridge synthetic d(LL4/d$a;)Z
    .locals 0

    iget-boolean p0, p0, LL4/d$a;->a:Z

    return p0
.end method


# virtual methods
.method public a()LL4/d;
    .locals 2

    new-instance v0, LL4/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LL4/d;-><init>(LL4/d$a;LL4/h;)V

    return-object v0
.end method
