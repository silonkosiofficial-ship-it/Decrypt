.class public final LV/a1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:LV/Z0;

.field private b:LV/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LV/Z0;LV/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV/a1;->a:LV/Z0;

    iput-object p2, p0, LV/a1;->b:LV/d;

    return-void
.end method


# virtual methods
.method public final a()LV/d;
    .locals 1

    iget-object v0, p0, LV/a1;->b:LV/d;

    return-object v0
.end method

.method public final b()LV/Z0;
    .locals 1

    iget-object v0, p0, LV/a1;->a:LV/Z0;

    return-object v0
.end method
