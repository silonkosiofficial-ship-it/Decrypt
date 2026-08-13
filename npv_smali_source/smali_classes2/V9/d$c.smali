.class public final LV9/d$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LV9/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:I

.field private final b:LX9/g;


# direct methods
.method public constructor <init>(ILX9/g;)V
    .locals 1

    const-string v0, "data"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LV9/d$c;->a:I

    iput-object p2, p0, LV9/d$c;->b:LX9/g;

    return-void
.end method


# virtual methods
.method public final a()LX9/g;
    .locals 1

    iget-object v0, p0, LV9/d$c;->b:LX9/g;

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, LV9/d$c;->a:I

    return v0
.end method
