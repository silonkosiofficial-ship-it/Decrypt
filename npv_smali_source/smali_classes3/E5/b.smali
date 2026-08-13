.class public final synthetic LE5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le5/h;


# instance fields
.field public final synthetic a:Le5/F;


# direct methods
.method public synthetic constructor <init>(Le5/F;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE5/b;->a:Le5/F;

    return-void
.end method


# virtual methods
.method public final a(Le5/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LE5/b;->a:Le5/F;

    invoke-static {v0, p1}, LE5/f;->d(Le5/F;Le5/e;)LE5/f;

    move-result-object p1

    return-object p1
.end method
