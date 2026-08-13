.class final LF8/F$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF8/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:LF8/M;

.field private final b:LF8/e0;


# direct methods
.method public constructor <init>(LF8/M;LF8/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF8/F$b;->a:LF8/M;

    iput-object p2, p0, LF8/F$b;->b:LF8/e0;

    return-void
.end method


# virtual methods
.method public final a()LF8/M;
    .locals 1

    iget-object v0, p0, LF8/F$b;->a:LF8/M;

    return-object v0
.end method

.method public final b()LF8/e0;
    .locals 1

    iget-object v0, p0, LF8/F$b;->b:LF8/e0;

    return-object v0
.end method
