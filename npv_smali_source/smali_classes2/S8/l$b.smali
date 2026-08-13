.class public final LS8/l$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS8/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:LS8/l;


# direct methods
.method public constructor <init>(LS8/l;)V
    .locals 1

    const-string v0, "match"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS8/l$b;->a:LS8/l;

    return-void
.end method


# virtual methods
.method public final a()LS8/l;
    .locals 1

    iget-object v0, p0, LS8/l$b;->a:LS8/l;

    return-object v0
.end method
