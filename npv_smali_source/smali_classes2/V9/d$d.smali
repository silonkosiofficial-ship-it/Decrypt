.class public abstract LV9/d$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LV9/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "d"
.end annotation


# instance fields
.field private final C:Z

.field private final D:LX9/f;

.field private final E:LX9/e;


# direct methods
.method public constructor <init>(ZLX9/f;LX9/e;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sink"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LV9/d$d;->C:Z

    iput-object p2, p0, LV9/d$d;->D:LX9/f;

    iput-object p3, p0, LV9/d$d;->E:LX9/e;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, LV9/d$d;->C:Z

    return v0
.end method

.method public final f()LX9/e;
    .locals 1

    iget-object v0, p0, LV9/d$d;->E:LX9/e;

    return-object v0
.end method

.method public final g()LX9/f;
    .locals 1

    iget-object v0, p0, LV9/d$d;->D:LX9/f;

    return-object v0
.end method
